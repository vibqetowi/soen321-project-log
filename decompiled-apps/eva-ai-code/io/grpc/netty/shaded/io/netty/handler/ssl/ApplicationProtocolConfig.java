package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
/* loaded from: classes4.dex */
public final class ApplicationProtocolConfig {
    public static final ApplicationProtocolConfig DISABLED = new ApplicationProtocolConfig();
    private final Protocol protocol;
    private final SelectedListenerFailureBehavior selectedBehavior;
    private final SelectorFailureBehavior selectorBehavior;
    private final List<String> supportedProtocols;

    /* loaded from: classes4.dex */
    public enum Protocol {
        NONE,
        NPN,
        ALPN,
        NPN_AND_ALPN
    }

    /* loaded from: classes4.dex */
    public enum SelectedListenerFailureBehavior {
        ACCEPT,
        FATAL_ALERT,
        CHOOSE_MY_LAST_PROTOCOL
    }

    /* loaded from: classes4.dex */
    public enum SelectorFailureBehavior {
        FATAL_ALERT,
        NO_ADVERTISE,
        CHOOSE_MY_LAST_PROTOCOL
    }

    public ApplicationProtocolConfig(Protocol protocol, SelectorFailureBehavior selectorFailureBehavior, SelectedListenerFailureBehavior selectedListenerFailureBehavior, Iterable<String> iterable) {
        this(protocol, selectorFailureBehavior, selectedListenerFailureBehavior, ApplicationProtocolUtil.toList(iterable));
    }

    public ApplicationProtocolConfig(Protocol protocol, SelectorFailureBehavior selectorFailureBehavior, SelectedListenerFailureBehavior selectedListenerFailureBehavior, String... strArr) {
        this(protocol, selectorFailureBehavior, selectedListenerFailureBehavior, ApplicationProtocolUtil.toList(strArr));
    }

    private ApplicationProtocolConfig(Protocol protocol, SelectorFailureBehavior selectorFailureBehavior, SelectedListenerFailureBehavior selectedListenerFailureBehavior, List<String> list) {
        this.supportedProtocols = Collections.unmodifiableList((List) ObjectUtil.checkNotNull(list, "supportedProtocols"));
        this.protocol = (Protocol) ObjectUtil.checkNotNull(protocol, "protocol");
        this.selectorBehavior = (SelectorFailureBehavior) ObjectUtil.checkNotNull(selectorFailureBehavior, "selectorBehavior");
        this.selectedBehavior = (SelectedListenerFailureBehavior) ObjectUtil.checkNotNull(selectedListenerFailureBehavior, "selectedBehavior");
        if (protocol == Protocol.NONE) {
            throw new IllegalArgumentException("protocol (" + Protocol.NONE + ") must not be " + Protocol.NONE + ClassUtils.PACKAGE_SEPARATOR_CHAR);
        } else if (list.isEmpty()) {
            throw new IllegalArgumentException("supportedProtocols must be not empty");
        }
    }

    private ApplicationProtocolConfig() {
        this.supportedProtocols = Collections.emptyList();
        this.protocol = Protocol.NONE;
        this.selectorBehavior = SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL;
        this.selectedBehavior = SelectedListenerFailureBehavior.ACCEPT;
    }

    public List<String> supportedProtocols() {
        return this.supportedProtocols;
    }

    public Protocol protocol() {
        return this.protocol;
    }

    public SelectorFailureBehavior selectorFailureBehavior() {
        return this.selectorBehavior;
    }

    public SelectedListenerFailureBehavior selectedListenerFailureBehavior() {
        return this.selectedBehavior;
    }
}
