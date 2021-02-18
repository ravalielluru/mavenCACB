package com.javaworld.awslambda.widget.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.javaworld.awslambda.widget.model.Widget;
import com.javaworld.awslambda.widget.model.WidgetRequest;

public class GetWidgetHandler implements RequestHandler<WidgetRequest, Widget> {
    @Override
    public Widget handleRequest(WidgetRequest widgetRequest, Context context) {
        return new Widget(widgetRequest.getId(), "My Widget " + widgetRequest.getId());
    }
}
