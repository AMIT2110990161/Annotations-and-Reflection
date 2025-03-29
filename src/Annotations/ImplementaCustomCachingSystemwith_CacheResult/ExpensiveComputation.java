package Annotations.ImplementaCustomCachingSystemwith_CacheResult;

import java.util.HashMap;

class ExpensiveComputation {
    private static final HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int computeSquare(int num) {
        if (cache.containsKey(num)) return cache.get(num);
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

