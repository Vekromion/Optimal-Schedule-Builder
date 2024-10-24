package edu.uga.devdogs.bruteforceprototype;

import edu.uga.devdogs.bruteforceprototype.schedule.Schedule;
import edu.uga.devdogs.sampledataparser.records.Course;
import edu.uga.devdogs.sampledataparser.records.Distances;
import edu.uga.devdogs.sampledataparser.records.SampleData;

import java.util.HashSet;
import java.util.Set;

public class BruteForcePrototype {

    private final Course[] courses;
    private final Distances distances;

    public BruteForcePrototype(SampleData sampleData) {
        this.courses = sampleData.courses();
        this.distances = sampleData.distances();
    }

    public Schedule optimize(Set<String> course_codes) {
        return new Schedule(new HashSet<>());
    }

}