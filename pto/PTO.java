package pto;

/**
 * Created by kyle on 8/7/17.
 */
public interface PTO {

    /**
     * Returns how many hours of Paid Time Off the employee has available.
     *
     * @param employeeId The ID of the employee to check
     *
     * @return The number of PTO hours the employee has available
     */
    double accured(int employeeId);


    /**
     * Returns how many hours of Paid Time Off the employee has used.
     *
     * @param employeeId The ID of the employee to check
     *
     * @return The number of PTO hours the employee has available
     */
    double used(int employeeId);


    /**
     * Reduces the employee's available PTO by the given
     * {@param hours}.
     *
     * @param employeeId The ID of the employee to check
     * @param hours The number of hours the employee is taking
     *
     * @return How many PTO hours the employee has remaining
     */
    double take(int employeeId, double hours);

    /**
     * Adds more {@param hours} to the employee's PTO.
     *
     * @param employeeId The ID of the employee to check
     * @param hours The number of hours the employee is taking
     *
     * @return How many PTO hours the the employee has now
     */
    double accure(int employeeId, double hours);
}
