package prep2025.string;

import java.util.Stack;

public class SimplifyPathLinux {

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
//        String path = "/../";
        System.out.println(simplifyPathfresh(path));
    }


    public static String simplifyPath(String path) {
        String[] pathArray = path.split("(?=/)|(?<=/)");
        Stack<String> stack = new Stack<>();
        for (String s : pathArray) stack.push(s);
        String res = "";
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            if (temp.equals("/")) {
                if (res.isEmpty()) {
                    res = res;
                } else if (!res.isEmpty() && res.charAt(0) != '/') {
                    res = temp + res;
                }

            } else if (temp.equals("...") || temp.equals("....")) {
                res = temp + res;
            } else if (temp.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty() && !(stack.peek().equals(".."))) {
                        stack.pop();
                        if (!stack.isEmpty()) stack.pop();
                    }
                }
            } else if (temp.equals(".")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                res = temp + res;
            }
        }
        if (res.isEmpty()) res = "/";
        return res;
    }


    public static String simplifyPathfresh(String path) {
        String[] pathArray = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i].equals(".") || pathArray[i].equals("")) continue;
            if (pathArray[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(pathArray[i]);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0,"/"+stack.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();

    }


}
