package 算法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getPresent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checkNum = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < checkNum; i++) {
            list.add(sc.nextLine());
        }

        List<Boolean> result = new ArrayList<>();
        for (String solution : list) {
            String[] solutionArray = solution.split(" ");
            int absentNum = 0, lateNum = 0, leaveearlyNum = 0;
            int continuousLate = 0;
            int continuousLeaveearly = 0;
            boolean absentOrNot = true;
            for (int i = 0; i < solutionArray.length; i++) {
                if (solutionArray[i].equals("absent")) {
                    absentNum++;
                }
                if (solutionArray[i].equals("late")) {
                    continuousLate++;
                    lateNum++;
                } else {
                    continuousLate = 0;
                }
                if (solutionArray[i].equals("leaveearly")) {
                    continuousLeaveearly++;
                    leaveearlyNum++;
                } else {
                    continuousLeaveearly = 0;
                }

                if (absentNum > 1) {
                    result.add(false);
                    absentOrNot = false;
                    break;
                }
                if (continuousLate > 1 || continuousLeaveearly > 1) {
                    result.add(false);
                    absentOrNot = false;
                    break;
                }

                if (solutionArray.length <= 7) {
                    if (lateNum > 3 || leaveearlyNum > 3 || absentNum > 3) {
                        result.add(false);
                        absentOrNot = false;
                        break;
                    }
                } else {
                    int newLateNum = 0, newLeaveearlyNum = 0, newAbsentNum = 0;
                    if (i + 7 <= solutionArray.length) {
                        String[] sevenArray = new String[7];
                        for (int j = 0; j < 7; j++) {
                            if (solutionArray[i+j].equals("late")) {
                                newLateNum++;
                            } else if (solutionArray[i+j].equals("leaveearly")) {
                                newLeaveearlyNum++;
                            } else if (solutionArray[i+j].equals("absent")) {
                                newAbsentNum++;
                            }
                        }
                    }

                    if (newLateNum > 3 || newLeaveearlyNum > 3 || newAbsentNum > 3) {
                        result.add(false);
                        absentOrNot = false;
                        break;
                    }
                }
            }

            if (absentOrNot) {
                result.add(true);
            }
        }

        for (Boolean r : result) {
            System.out.print(r);
            System.out.print(" ");
        }
    }

}
