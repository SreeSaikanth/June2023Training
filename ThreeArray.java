class ThreeArray
{
public static void main(String args[])
{
int [][][] test={  { {1,3,2},{4,5,3}	},
{	{2,4,3,9},   {1},        {2,3}}
};
for(int[][] array2D:test)
{
for(int[] array1D:array2D)
{
for(int item:array1D)
{
System.out.println(item);
}
}
}
}
}