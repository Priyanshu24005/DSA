/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findPeak(MountainArray arr) {
        int f = 0;
        int l = arr.length() - 1;

        while (f < l) {
            int mid = f + (l - f) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                l = mid;
            } else {
                f = mid + 1;
            }
        }

        return f;
    }

    public int binarySearch(MountainArray arr, int target, int f, int l, boolean ascending) {

        while (f <= l) {
            int mid = f + (l - f) / 2;

            int value = arr.get(mid);

            if (value == target) {
                return mid;
            }

            if (ascending) {
                if (value < target) {
                    f = mid + 1;
                } else {
                    l = mid - 1;
                }
            } else {
                if (value < target) {
                    l = mid - 1;
                } else {
                    f = mid + 1;
                }
            }
        }

        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);

        // Search in increasing part
        int left = binarySearch(
            mountainArr,
            target,
            0,
            peak,
            true
        );

        if (left != -1) {
            return left;
        }

        // Search in decreasing part
        return binarySearch(
            mountainArr,
            target,
            peak + 1,
            mountainArr.length() - 1,
            false
        );
    }
}