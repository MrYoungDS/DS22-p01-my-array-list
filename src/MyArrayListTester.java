import java.util.ArrayList;

public class MyArrayListTester
{
    public static void main(String[] args)
    {
        MyArrayList al1 = new MyArrayList();
        MyArrayList al2 = new MyArrayList();
        int tests = 0;
        int fails = 0;

        // small test
        al1.add(65);
        al1.add(72);
        al1.add(11);
        al1.add(32); // 65, 72, 11, 32

        tests++;
        if (al1.size() != 4)
        {
            System.out.println("size test failed");
            fails++;
        }

        tests++;
        if (al2.size() != 0)
        {
            System.out.println("empty test failed");
            fails++;
        }

        tests++;
        if (al1.get(1) != 72)
        {
            System.out.println("get test failed");
            fails++;
        }

        tests++;
        al1.set(2, 89); // 65, 72, 89, 32
        if (al1.get(2) != 89)
        {
            System.out.println("set/get test failed");
            fails++;
        }

        al1.add(1, 41);
        al1.add(5, 93); // 65, 41, 72, 89, 32, 93
        //System.out.println(printList(al1));
        tests++;
        if (al1.size() != 6)
        {
            System.out.println("add test 1 failed");
            fails++;
        }
        tests++;
        if (al1.get(2) != 72)
        {
            System.out.println("add test 2 failed");
            fails++;
        }
        tests++;
        if (al1.get(5) != 93)
        {
            System.out.println("add test 3 failed");
            fails++;
        }

        tests++;
        if (al1.remove(4) != 32) // 65, 41, 72, 89, 93
        {
            System.out.println("remove test 1 failed");
            fails++;
        }
        tests++;
        if (al1.size() != 5)
        {
            System.out.println("remove test 1 failed");
            fails++;
        }
        tests++;
        if (al1.get(4) != 93)
        {
            System.out.println("remove test 1 failed");
            fails++;
        }

        tests++;
        al1.clear();
        if (al1.size() != 0)
        {
            System.out.println("clear test failed");
            fails++;
        }

        if (fails > 0)
        {
            System.out.println("Small test: failed " + fails + " out of " + tests);
        }
        else
        {
            System.out.println("Small test: all tests passed");
        }

        // large test
        final int LOW_SIZE = 100;
        final int RANGE_SIZE = 20;
        final int LOW_VAL = 200;
        final int RANGE_VAL = 500;
        int n = (int)(LOW_SIZE + Math.random() * RANGE_SIZE);
        ArrayList<Integer> testList = new ArrayList<Integer>();

        boolean match = true;
        for (int i = 0; i < n; i++)
        {
            int e = (int)(LOW_VAL + Math.random() * RANGE_VAL);
            testList.add(e);
            al2.add(e);
        }
        for (int i = 0; i < n; i++)
        {
            if (testList.get(i) != al2.get(i))
            {
                match = false;
            }
        }
        System.out.print("Large value test:");
        System.out.println(match ? "passed" : "failed");

        match = true;
        for (int i = LOW_VAL; i < LOW_VAL + RANGE_VAL; i++)
        {
            if (testList.contains(i) != al2.contains(i))
            {
                match = false;
            }
        }
        System.out.print("Large contains test:");
        System.out.println(match ? "passed" : "failed");
    }

    public static String printList(MyArrayList aList)
    {
        String result = "{";
        if (aList.size() > 0)
        {
            result += aList.get(0);
        }
        for (int i = 1; i < aList.size(); i++)
        {
            result += "," + aList.get(i);
        }
        result += "}";
        return result;
    }
}
