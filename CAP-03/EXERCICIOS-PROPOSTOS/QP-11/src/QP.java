import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import java.awt.Robot;
import java.awt.Toolkit;

public class QP {
    static boolean runCommand(Robot robot, HashMap<Character, Integer> keys, boolean isCapsLockOn, String command) {
        for (int i = 0; i < command.length(); i++) {
            char letter = command.charAt(i);
            boolean isUppercase = Character.isUpperCase(letter);

            if (isUppercase && !isCapsLockOn) {
                robot.keyPress(20);
                robot.keyRelease(20);
                isCapsLockOn = true;
            }

            if (!isUppercase && isCapsLockOn) {
                robot.keyPress(20);
                robot.keyRelease(20);
                isCapsLockOn = false;
            }

            robot.keyPress(keys.get(Character.toLowerCase(letter)));
            robot.keyRelease(keys.get(Character.toLowerCase(letter)));
        }

        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        System.out.println("a");
        return isCapsLockOn;
    }

    public static void main(String[] args) {
        try {
            HashMap<Character, Integer> keys = new HashMap<Character, Integer>();
            keys.put(' ', 32);
            keys.put('-', 45);
            keys.put('.', 46);
            keys.put('0', 48);
            keys.put('1', 49);
            keys.put('2', 50);
            keys.put('3', 51);
            keys.put('4', 52);
            keys.put('5', 53);
            keys.put('6', 54);
            keys.put('7', 55);
            keys.put('8', 56);
            keys.put('9', 57);
            keys.put('a', 65);
            keys.put('b', 66);
            keys.put('c', 67);
            keys.put('d', 68);
            keys.put('e', 69);
            keys.put('i', 73);
            keys.put('j', 74);
            keys.put('l', 76);
            keys.put('m', 77);
            keys.put('n', 78);
            keys.put('o', 79);
            keys.put('p', 80);
            keys.put('q', 81);
            keys.put('r', 82);
            keys.put('s', 83);
            keys.put('t', 84);
            keys.put('u', 85);
            keys.put('v', 86);
            keys.put('x', 88);

            String cdCommand1 = "cd DISC-POO-2024.1-T01";
            String cdCommand2 = "cd CAP-03";
            String cdCommand3 = "cd EXERCICIOS-PROPOSTOS";
            String cdCommand4 = "cd QP-11";
            String cdCommand5 = "cd src";
            String cdCommand6 = "cd br";
            String cdCommand7 = "cd edu";
            String cdCommand8 = "cd principal";
            String command = "java Principal.java";
            Robot robot = new Robot();

            robot.keyPress(java.awt.event.KeyEvent.VK_WINDOWS);
            robot.keyPress(java.awt.event.KeyEvent.VK_R);
            robot.keyRelease(java.awt.event.KeyEvent.VK_WINDOWS);
            robot.keyRelease(java.awt.event.KeyEvent.VK_R);

            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }

            robot.keyPress(java.awt.event.KeyEvent.VK_C);
            robot.keyRelease(java.awt.event.KeyEvent.VK_C);

            robot.keyPress(java.awt.event.KeyEvent.VK_M);
            robot.keyRelease(java.awt.event.KeyEvent.VK_M);

            robot.keyPress(java.awt.event.KeyEvent.VK_D);
            robot.keyRelease(java.awt.event.KeyEvent.VK_D);

            robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
            robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

            try {
                TimeUnit.SECONDS.sleep(2);
            }
            catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }

            boolean isCapsLockOn = Toolkit.getDefaultToolkit().getLockingKeyState(20);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand1);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand2);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand3);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand4);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand5);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand6);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand7);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, cdCommand8);
            isCapsLockOn = runCommand(robot, keys, isCapsLockOn, command);
        }
        catch (java.awt.AWTException e) {
            e.printStackTrace();
        }
    }
}