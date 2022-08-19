package com.devmountain;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File cases = new File("./data/txt/Case.txt");
        File cpus = new File("./data/txt/CPU.txt");
        File cpuCoolers = new File("./data/txt/CPU_COOLER.txt");
        File gpus = new File("./data/txt/GPU.txt");

        File motherboards = new File("./data/csv/motherboard.csv");
        File psu = new File("./data/csv/psu.csv");
        File ram = new File("./data/csv/ram.csv");
        File storage = new File("./data/csv/storage.csv");

        System.out.println(seedCases(cases));
    }

    public static void openFileAndPrint(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while((line = bufferedReader.readLine()) != null)
        {
            String[] values;
//            System.out.println(line);
            if(file.getName().contains(".txt")) {
                values = line.split("\\|");
                System.out.println(Arrays.toString(values));
            }
            else
            {
                values = line.split(",");
                System.out.println(Arrays.toString(values));
            }
        }
    }

    public static List<Case> seedCases(File file) throws IOException
    {
        List<Case> caseList = new ArrayList<>();
        FileReader filereader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line;

        while((line = bufferedReader.readLine()) != null)
        {
            String[] values = line.split("\\|");
            String brand = values[0];
            String name = values[1];
            String type = values[2];
            String color = values[3];
            String price = values[4];

            Case pcCase = new Case(brand,name,type,color,price);
            caseList.add(pcCase);
        }

        return caseList;
    }

    public static List<Gpu> seedGpus(File file) throws IOException
    {
        List<Gpu> gpuList = new ArrayList<>();
        FileReader filereader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line;
        while((line = bufferedReader.readLine()) != null)
        {
            String[] values = line.split("\\|");
            Gpu gpu = new Gpu();

            gpu.setBrand(values[0]);
            gpu.setName(values[1]);
            gpu.setChipset(values[2]);
            gpu.setMemory(values[3]);
            gpu.setBaseClock(values[4]);
            gpu.setBoostClock(values[5]);
            gpu.setPrice(values[6]);

            gpuList.add(gpu);
        }

        return gpuList;
    }

    public static List<Storage> seedStorage(File file) throws IOException
    {
        List<Storage> storages = new ArrayList<>();
        FileReader filereader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line;
        while((line = bufferedReader.readLine()) != null)
        {
            String[] values = line.split(",");

            Storage storage = new Storage(values);
            storages.add(storage);
        }

        return storages;
    }

}
