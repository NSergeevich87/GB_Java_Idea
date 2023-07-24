package ru.gb.oop.homework3;

public class StreamComparator implements Comparable<Stream> {
    private Stream stream;

    @Override
    public int compareTo(Stream o) {
        if (this.stream.returnSizeGroups() > o.returnSizeGroups())
            return 1;
        else if (this.stream.returnSizeGroups() < o.returnSizeGroups())
            return -1;
        else
            return 0;
    }
    //private List<StudentsGroup> studentsGroupsB;
//    public StreamComparator(){
//        studentsGroupsA = null;
//        studentsGroupsB = null;
//    }
    public StreamComparator(Stream A){
        this.stream = A;
    }

//    public String compareTo() {
//        if (this.studentsGroupsA.size() > this.studentsGroupsB.size())
//            return "В 1ом потоке больше групп.";
//    else if (this.studentsGroupsA.size() < this.studentsGroupsB.size())
//            return "Во 2ом потоке больше групп.";
//        return null;
//    }
}
