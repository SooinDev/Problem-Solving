#include <string>
#include <vector>

using namespace std;

int solution(int n) {
	int total = 0;
	if (n % 2 == 1) {
		for (int i = 1; i <= n; i+=2)
		{
			total += i;
		}
		return total;
	}
	else {
		for (int i = 2; i <= n; i+=2)
		{
			total += (i * i);
		}
		return total;
	}
}