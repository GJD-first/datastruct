package datastruct;

public class Graph {
	public int vex;
	public int edg;
	int[][] chart;

	public Graph(int avex) {
		vex = avex;
		edg = 0;
		chart = new int[avex][avex];
		for (int i = 0; i < avex; i++) {
			for (int j = 0; j < avex; j++) {
				chart[i][j] = 0;
			}
		}
	}

	public void add(int s, int e) {
		if (s >= vex || e >= vex)
			return;
		if (s < 0 || e < 0)
			return;
		if (chart[s][e] == 1)
			return;
		chart[s][e] = 1;
		chart[e][s] = 1;
		edg++;
	}

	private void print() {
		for (int i = 0; i < vex; i++) {
			for (int j = 0; j < vex; j++) {
				System.out.print(chart[i][j] + " ");
			}
			System.out.println();
		}
	}
}
