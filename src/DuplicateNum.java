public class DuplicateNum {
    public static void main(String[] args) {
        int[]numOfArray = {2,3,4,3,5,5,4};

        DuplicateNum obj = new DuplicateNum();
        obj.duplicatenum(numOfArray);

    }
      void duplicatenum (int[]arr) {
          int[] temp = new int[arr.length / 2];
          int index = 0;


          for (int i = 0; i < arr.length; i++) {
              int val = arr[i];

              for (int j = i + 1; j < arr.length; j++) {
                  int num1 = arr[j];

                  if (i != j) {
                      if (val == num1) {
                          temp[index]=val;
                          index++;
                      }

                      }
                  }
              }
                for (int i : temp){
                    System.out.println("DUPLICATE ELEMENT IS : "+i);
                }
          }

      }