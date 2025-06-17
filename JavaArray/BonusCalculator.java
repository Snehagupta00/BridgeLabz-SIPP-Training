import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));

            do {
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
            } while (salary[i] <= 0);

            do {
                System.out.print("Enter years of service: ");
                years[i] = sc.nextDouble();
            } while (years[i] < 0);

            totalOldSalary += salary[i];

            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.1f\t%.2f\t%.2f\n", salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}
