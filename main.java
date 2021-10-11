public static int solution (int[] x) {
    int found = 0;
    int i = 0;
    int j = 1;

    Arrays.sort(x);
    //To sort the array so if you have {9 , 3 , 9 , 3 , 9 , 7 , 9} 
    //it will be { 3 , 3 , 7 , 9 , 9 , 9 , 9}
    if (x.length == 1) {
        found = x[0];
    }

    while (x.length % 2 == 1 && i < x.length && j < x.length) {
        if (x[i] == x[i+1]) {
            i = i + 2;
            j = j + 2;  
        } else {
            found = x[i];
            break;
        }
    }

    if (found == 0 && i == x.length-1) {
        found = x[i];
    }

    return found;
}
