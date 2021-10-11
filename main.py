public int solution(int[] A) {
    int result = 0;
    for (int x : A) result ^= x;
    return result;
}
