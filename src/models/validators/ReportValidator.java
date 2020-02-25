package models.validators;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import models.Report;



public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();





        String title_error = _validateTitle(r.getTitle());
        if (!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }


        String start_error = _validateStart(r.getStart_at());
        if (!start_error.equals("") ) {
            errors.add(start_error);
        }

        String end_error = _validateEnd(r.getEnd_at());
        if (!end_error.equals("")) {
            errors.add(end_error);
        }

        return errors;
    }

    private static String _validateEnd(Timestamp end_at) {
        if (end_at == null || end_at.equals("")) {
            return "退勤時間を入力してください。";
        }
        return "";
    }

    private static String _validateStart(Timestamp start_at) {
        if (start_at == null || start_at.equals("")) {
            return "出勤時間を入力してください。";
        }
        return "";

    }

    private static String _validateTitle(String title) {
        if (title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if (content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }
}
