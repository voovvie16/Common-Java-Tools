package com.thinking.machines.util;

public class TMLinkedList<T> implements TMList<T>
{
    class TMNode<T>
    {
        T data;
        TMNode<T> next;
        TMNode()
        {
            this.data = null;
            this.next = null;
        }
    }

    TMNode<T> start, end;
    int size;

    public TMLinkedList()
    {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public class TMLinkedListIterator<T> implements TMIterator<T>
    {
        TMNode<T> ptr;

        TMLinkedListIterator(TMNode<T> ptr)
        {
            this.ptr = ptr;
        }

        public boolean hasNext()
        {
            return this.ptr != null;
        }
        public T next()
        {
            if (this.ptr == null)
                throw new InvalidIteratorException("Iterator has no more elements");
            T data = this.ptr.data;
            this.ptr = this.ptr.next;
            return data;
        }
    }

    public void add(T data)
    {
        TMNode<T> t;
        t = new TMNode<T>();
        t.data = data;
        
        if (this.size == 0) this.start = this.end = t;
        else
        {
            this.end.next = t;
            this.end = t;
        }
        this.size++;
    }
    public void add(int index, T data)
    {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("Invalid Index : " + -1);

        if (index >= this.size)
        {
            this.add(data);
            return;
        }

        TMNode<T> t;
        t = new TMNode<T>();
        t.data = data;

        if (index == 0)
        {
            t.next = this.start;
            this.start = t;
        }
        else
        {
            TMNode<T> k = null;
            TMNode<T> j = this.start;
            for (int i = 0; i < index; i++)
            {
                k = j;
                j = j.next;
            }

            k.next = t;
            t.next = j;
        }
        this.size++;
    }
    public void insert(int index, T data)
    {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("Invalid Index : " + -1);

        if (index >= this.size)
        {
            this.add(data);
            return;
        }

        TMNode<T> t;
        t = new TMNode<T>();
        t.data = data;

        if (index == 0)
        {
            t.next = this.start;
            this.start = t;
        }
        else
        {
            TMNode<T> k = null;
            TMNode<T> j = this.start;
            for (int i = 0; i < index; i++)
            {
                k = j;
                j = j.next;
            }

            k.next = t;
            t.next = j;
        }
        this.size++;
    }

    public void removeAll()
    {
        this.size = 0;
        this.start = null;
        this.end = null;
    }
    public void clear()
    {
        this.size = 0;
        this.start = null;
        this.end = null;
    }
    public int size()
    {
        return this.size;
    }

    public T get(int index)
    {
        if (index < 0 || index >= this.size)
            throw new ArrayIndexOutOfBoundsException("Invalid Index : " + index);

        TMNode<T> t = this.start;
        for (int i = 0; i < index; i++) t = t.next;

        return t.data;
    }

    public void update(int index, T data)
    {
        if (index < 0 || index >= this.size)
            throw new ArrayIndexOutOfBoundsException("Invalid Index : " + index);
        
        if (index == 0)
        {
            this.start.data = data;
            return;
        }

        int i = 0;    
        TMNode<T> j = this.start;
        while (i < index)
        {
            j = j.next;
            i++;
        }
        j.data = data;
    }

    public void copyTo(TMList<T> other)
    {
        other.clear();
        for (int i = 0; i < this.size; i++)
            other.add(this.get(i));
    }
    public void copyFrom(TMList<T> other)
    {
        this.clear();
        for (int i = 0; i < other.size(); i++)
            this.add(other.get(i));
    }

    public void appendTo(TMList<T> other)
    {
        for (int i = 0; i < this.size; i++)
            other.add(this.get(i));
    }
    public void appendFrom(TMList<T> other)
    {
        for (int i = 0; i < other.size(); i++)
            this.add(other.get(i));
    }

    public TMIterator<T> iterator()
    {
        return new TMLinkedListIterator<T>(this.start);
    }

    public void forEach(TMListItemAcceptor<T> a)
    {
        if (a == null) return;
        
        TMNode<T> t;
        for (t = this.start; t != null; t = t.next)
            a.accept(t.data);
    }
}