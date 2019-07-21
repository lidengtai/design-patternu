package com.taylor.patterns.iterator;

/**
 * @ClassName NameRepository
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 9:22
 * @Version 1.0
 */
public class NameRepository implements Container {

    public String names[] = {"zhangsan","lisi","wangwu","weiliu"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if (index<names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
