package cloud.folium.internship.customiterator;

import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterator {
    private List list;
    private List nestedList;
    private int index;


    public MyIterator(List list, List nestedList, int index) {
        this.list = list;
        this.nestedList = nestedList;
        this.index = index;
    }

    public MyIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index == list.size() && nestedList.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            return null;
        }
        if(index <= list.size()-1) {
            Object nextElement = list.get(index);
            if(nextElement instanceof List) {
                nestedList.add(list.get(index));
                nestedList = (List)nextElement;
                index = 0;
                return nestedList.get(index++);
            } else {
                return nestedList.get(index++);
            }
        }
        return next();

        }

    public List getList() {
        return list;
    }

    public List getNestedList() {
        return nestedList;
    }

    public int getIndex() {
        return index;
    }
}

