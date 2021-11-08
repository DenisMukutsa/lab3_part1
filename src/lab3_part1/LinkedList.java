package lab3_part1; 

public class LinkedList {

    private Element element;

    class Element {
        private int data;
        private Element child;
    }

    public void addFirst(int value) {
        if(element != null) {
            Element newElement = new Element();
            newElement.child = element;
            element = newElement;
            newElement.data = value;
        }
        else {
            element = new Element();
            element.data = value;
        }
    }

    public int getFirst() {
        if (element != null) {
            return element.data;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public void addLast(int value) {
        if (element != null) {
            Element tempElement = element;
            while(tempElement.child != null) {
                tempElement = tempElement.child;
            }
            Element newElement = new Element();
            newElement.child = null;
            newElement.data = value;
            tempElement.child = newElement;
        }
        else {
            element = new Element();
            element.data = value;
        }
    }

    public int getLast() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child != null) {
                tempElement = tempElement.child;
            }
            return tempElement.data;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public void removeFirst() {
        if (element != null) {
            element = element.child;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public void removeLast() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child.child != null) {
                tempElement = tempElement.child;
            }
            tempElement.child = null;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public int size() {
        if (element != null) {
            Element tempElement = element;
            int counter = 0;

            while (tempElement != null) {
                counter++;
                tempElement = tempElement.child;
            }
            return counter;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public boolean contains (int value) {
        if (element != null) {
            Element tempElement = element;
            while (tempElement != null) {
                if (tempElement.data==value) {
                    return true;
                }
                tempElement = tempElement.child;
            }
            return false;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public int getRemoveFromEnd() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child.child != null)
                tempElement = tempElement.child;
            int data = tempElement.child.data;
            tempElement.child = null;
            return data;

        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }

    public int getRemoveFromStart() {
        if (element != null) {
            int data = element.data;
            element = element.child;
            return data;
        }
        else {
            throw new NullPointerException("Коллекция пуста");
        }
    }


    public String print() {
        if (element != null) {
            String line = "";
            Element tempElement = element;
            while (tempElement != null) {
                line = line + " " + tempElement.data;
                tempElement = tempElement.child;
            }
            return line;
        }
        else {
            return "Коллекция пуста";
        }
    }
}
