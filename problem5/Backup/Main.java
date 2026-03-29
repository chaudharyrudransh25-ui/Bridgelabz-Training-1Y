package com.gla.Interfaces.problem5.Backup;

public class Main {
    public static void main(String[] args) {
        UserData u = new UserData("Rudransh");
        BackupProcessor bp = new BackupProcessor();

        bp.process(u);
    }
}