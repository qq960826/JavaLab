package P5;

/**
 * Created by wzq on 11/18/16.
 */
public class Sort {
    static void shellsort(int data[]){
        int gap=data.length/2;
        while (gap>=1){
            for(int i=gap;i<data.length;i++){
                int j=0;
                int temp=data[i];
                for(j=i-gap;j>=0&&temp<data[j];j=j-gap){
                    data[j+gap]=data[j];
                }
                data[j+gap]=temp;
            }
            gap=gap/2;
        }
    }




    static void bublesort(int data[]){
        for(int i=0;i<data.length;i++){
            for(int j=i;j<data.length;j++){
                if(data[i]>data[j]){
                    int temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
    }
    static void insertsort(int data[]){
        for(int i=0;i<data.length;i++){
            int pos=i;
            int current=data[i];
            for(int j=i-1;j>=0;j--){
                if(data[j]>current){
                    data[j+1]=data[j];
                    pos--;
                }else break;

            }
            data[pos]=current;
        }















//        for(int i=0;i<data.length;i++){
//            int current=data[i];
//            int pos=i;
//            for(int j=i-1;j>=0;j--){
//                if(data[j]>current){
//                    data[j+1]=data[j];
//                    pos--;
//                }else{
//                    break;
//                }
//            }
//            data[pos]=current;
//        }

    }
    static int partition(int data[],int begin,int end){
        int pivot=data[end];
        int i=begin;
        for(int j=begin;j<end;j++){
            if(data[j]<pivot){
                int temp=data[j];
                data[j]=data[i];
                data[i]=temp;
                i++;
            }
        }
        data[end]=data[i];
        data[i]=pivot;
        return i;
    }

    static void quicksort(int data[],int begin,int end){
        if(begin<end){
            int pos=partition(data,begin,end);
            quicksort(data,begin,pos-1);
            quicksort(data,pos+1,end);
        }
    }
    static int locate(int data[],int target){
        int begin=0;
        int end=data.length-1;
        int mid = 0;
        while (begin<=end){
            mid=(begin+end)/2;
            if(data[mid]>target){
                end=mid-1;
            }else if(data[mid]<target){
                begin=mid+1;
            }else break;
        }
        return mid;
    }
    static int locate_recursion(int data[],int low,int high,int target)
    {
        if(low<=high){
            int mid=(low+high)/2;
            if(data[mid]==target)return mid;
            if(data[mid]>target)return locate_recursion(data,low,mid-1,target);
            if(data[mid]<target)return locate_recursion(data,mid+1,high,target);
        }
        return -1;
    }
    public static void main(String args[]){
        int data[]={9,8,7,6,5,11,4};
        //quicksort(data,0,data.length-1);
        //insertsort(data);
        //bublesort(data);
        insertsort(data);
        locate(data,11);
        int res=locate_recursion(data,0,data.length-1,11);
        System.out.print(res);
    }
}
