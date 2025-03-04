package io.getunleash.strategy;

import io.getunleash.UnleashContext;
import java.util.Map;

public interface Strategy {

    String getName();

    boolean isEnabled(Map<String, String> parameters, UnleashContext context);
}
