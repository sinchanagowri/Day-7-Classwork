import java.util.Scanner;

public class insertionsort {
	
		void sort(int arr[])
		{
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				        while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}

		 static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		public static void main(String args[])
		{
			
			Scanner s= new Scanner(System.in);
            int size=s.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++) {
            	arr[i]=s.nextInt();
            }
            s.close();
			insertionsort ob = new insertionsort();
			ob.sort(arr);

			printArray(arr);
		}
	};


	
