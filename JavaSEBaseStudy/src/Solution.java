import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Solution {

   private Map<String, Date> accessTimeMap;
   private Map<String, Integer> accessTimesMap;

   public synchronized boolean access(String ip) {
      if (accessTimeMap.get(ip) == null) {
         accessTimeMap.put(ip, new Date());
      }
      if (accessTimesMap.get(ip) == null) {
         accessTimesMap.put(ip, 0);
      }

      long nowTime = System.currentTimeMillis();
      if (nowTime - accessTimeMap.get(ip).getTime() > 60) {
         this.accessTimesMap.put(ip, 0);
         this.accessTimeMap.put(ip, new Date());
      } else {
         Integer times = this.accessTimesMap.get(ip);
         if (times == 10) {
            return false;
         } else {
            this.accessTimesMap.put(ip, ++times);
         }
      }

      return true;
   }

   public Map<String, Date> getAccessTimeMap() {
      return accessTimeMap;
   }

   public void setAccessTimeMap(Map<String, Date> accessTimeMap) {
      this.accessTimeMap = accessTimeMap;
   }

   public Map<String, Integer> getAccessTimesMap() {
      return accessTimesMap;
   }

   public void setAccessTimesMap(Map<String, Integer> accessTimesMap) {
      this.accessTimesMap = accessTimesMap;
   }

   public Solution(Map<String, Date> accessTimeMap, Map<String, Integer> accessTimesMap) {
      this.accessTimeMap = accessTimeMap;
      this.accessTimesMap = accessTimesMap;
   }

   public Solution() {};

   public static void main(String[] args) throws Exception {

      Solution solution = new Solution(new HashMap<>(), new HashMap<>());

      String ip = "11111";
      solution.access(ip);

   }
}
