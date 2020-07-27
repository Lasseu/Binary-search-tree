package com.lasseu;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.Paths;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {
        binarySearchTree BST = new binarySearchTree();
        Path text = Paths.get("filename.txt");
        Charset charset = Charset.forName("ISO-8859-1");

        List<String> lines = Files.readAllLines(text, charset);
        String[] arr = lines.toString().replaceAll("[^a-zæøåA-ZÆØÅ ]", "").toUpperCase().split("\\s+");


        for(int i = 0; i < arr.length; i++){
            BST.insert(arr[i]);
        }
        BST.inorder();
    }
}







