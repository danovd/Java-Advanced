package _18_Generics_Exersise;

import java.util.Arrays;
import java.util.List;

public class Sorter <T extends Comparable<T>>{


static _07_Custom_List sort(_07_Custom_List list){
   list.sort();
    return list;
}
}
