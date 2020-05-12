package com.weithink.proguardfile;


public class Main {

    public static void main(String[] args) {
        ChineseProguard.start();
        new SpecificCharacterProguard("proguard-o0O.txt", '0', 'o', 'O', '8', '〇').start();
        new SpecificCharacterProguard("proguard-1il.txt", '1', 'i', 'l', 'L', 'I', '丨').start();
        new SpecificCharacterProguard("proguard-socialism.txt", "abcdefghijklmnopqrstuvwxyz".toCharArray()).start();
    }

    public static void createFile() {
        ChineseProguard.start();
        new SpecificCharacterProguard("proguard-o0O.txt", '0', 'o', 'O', '8', '〇').start();
        new SpecificCharacterProguard("proguard-1il.txt", '1', 'i', 'l', 'L', 'I', '丨').start();
        new SpecificCharacterProguard("proguard-socialism.txt", "abcdefghijklmnopqrstuvwxyz".toCharArray()).start();

    }
}
