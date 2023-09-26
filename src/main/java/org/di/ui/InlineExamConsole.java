package org.di.ui;

import org.di.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InlineExamConsole implements ExamConsole {
    private Exam exam;

    public InlineExamConsole() {

    }

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

    @Autowired
    @Qualifier("exam1")
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
