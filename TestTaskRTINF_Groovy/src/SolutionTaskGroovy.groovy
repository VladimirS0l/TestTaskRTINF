class SolutionTaskGroovy {
    static void main(String[] args) {
        //[1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
        int[] nums = [1, 3, 4, 5, 1, 5, 4]
        def map = solution(nums)
        map.each{entry -> println "$entry.key: $entry.value"}
    }

    static Map<Integer, Integer> solution(int[] nums) {
        def map = [:]
        for (Integer i: nums){
            if (map.get(i) == null) {
                map.put(i, 1)
            } else {
                map.put(i, map.get(i) + 1)
            }
        }
        return map as Map<Integer, Integer>
    }


}
