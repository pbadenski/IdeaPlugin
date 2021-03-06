package org.axonframework.intellij.ide.plugin.handler;

import com.intellij.psi.PsiType;

import java.util.Set;

public interface EventHandlerRepository {

    void registerHandler(EventHandler eventHandler);

    Set<EventHandler> findHandlers(PsiType eventType);
}
