package io.sentry.transport;
/* loaded from: classes4.dex */
public final class NoOpTransportGate implements ITransportGate {
    private static final NoOpTransportGate instance = new NoOpTransportGate();

    @Override // io.sentry.transport.ITransportGate
    public boolean isConnected() {
        return true;
    }

    public static NoOpTransportGate getInstance() {
        return instance;
    }

    private NoOpTransportGate() {
    }
}
