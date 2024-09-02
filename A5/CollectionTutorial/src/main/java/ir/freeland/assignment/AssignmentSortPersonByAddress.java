package ir.freeland.assignment;

import java.util.Comparator;

import ir.freeland.assignment.model.AssignmentPerson;

public class AssignmentSortPersonByAddress implements Comparator<AssignmentPerson> {
	@Override
	public int compare(AssignmentPerson o1, AssignmentPerson o2) {
		return o1.compareTo(o2);
	}
}
