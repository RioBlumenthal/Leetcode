import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

class RandomizedSet {
   private ArrayList<Integer> indices;
   private HashMap<Integer, Integer> values;

   public RandomizedSet() {
      indices = new ArrayList<>();
      values = new HashMap<>();
   }
   
   public boolean insert(int val) {
      if(values.containsKey(val)) {
         return false;
      }
      indices.add(val);
      values.put(val, indices.size()-1);
      return true;
   }
   
   public boolean remove(int val) {
      if(values.containsKey(val)) {
         int index = values.get(val);
         int lastVal = indices.get(indices.size() - 1);
         indices.set(index, lastVal);
         indices.remove(indices.size() - 1);

         values.remove(val);
         if (values.containsKey(lastVal)) {
            values.put(lastVal, index);
         }
         return true;
      }
      return false;
   }
   
   public int getRandom() {
      int itemNum = new Random().nextInt(indices.size());
      return indices.get(itemNum);
   }
}