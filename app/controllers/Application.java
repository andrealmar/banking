package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

/**
 * Provides controllers for this application.
 */

public class Application extends Controller {

    /**
     * Returns the home page.
     * @return The resulting home page.
     */
    public static Result index() {

        return ok(index.render("Welcome to Crossover Bank."));
    }

    /**
     * Returns transfer, a simple example of a second page to illustrate navigation.
     * @return The Transfer Page.
     */
    public static Result transferMoney() {
        return ok(transfer.render("Transfer your money online"));

    }
}
