package com;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class DictionaryReaderTest {

    @Test
    public void SizePerDicDicReader() { 
        ArrayList<Asociacion<String, String>> dic = DictionaryReader.LoadTxt("src\\main\\java\\com\\txt files\\Diccionario.txt");
        assertEquals(95, dic.size());
        System.out.println(dic);
        for (int i = 0; i < dic.size(); i++) {
            System.out.println(dic.get(i).getKey());
            System.out.println(dic.get(i).getValue());
        }
    }
}
