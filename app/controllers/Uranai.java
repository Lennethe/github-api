package controllers;

import java.util.Map;

import play.api.mvc.Request;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.top;

import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import views.html.name_result;

public class Uranai extends Controller {
    public Result showTop() {
        return ok(top.render());
    }
    public Result showNameResult() {
//        String name = params.get("name");
        String name = "name";
//        DynamicForm input = FormFactory.form();
//        input = input.bindFromRequest(params);
//        String name = input.data().get("name");
//        // 入力チェック
//        if (name == null || name.trim().equals("")) {
//            return badRequest("名前を入力してください。");
//        }
        return ok(name_result.render(name));
    }
}