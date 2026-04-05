class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find max pile size
        for (int pile : piles) {
            high = Math.max(pile, high);
        }

        // Binary search for the smallest valid speed
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = 0;

            // Calculate hours needed at speed = mid
            for (int pile : piles) {
                totalHours += pile / mid;
                if (pile % mid != 0) {
                    totalHours += 1;
                }
            }

            if (totalHours <= h) {
                // mid works, try smaller speed
                high = mid - 1;
            } else {
                // too slow, increase speed
                low = mid + 1;
            }
        }

        return low; // smallest speed that works
    }
}
