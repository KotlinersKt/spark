package spark


/**
 * Model And View class is used to set the name of the view and the model object
 * to be rendered.
 *
 * @author alex
 */

/**
 * Constructs an instance with the provided model and view name
 *
 * @param model    the model
 * @param viewName the view name
 */

data class ModelAndView(val model: Any, val viewName:String)
