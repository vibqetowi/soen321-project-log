package io.grpc.netty.shaded.io.netty.channel;

import java.util.Queue;
/* loaded from: classes4.dex */
public interface EventLoopTaskQueueFactory {
    Queue<Runnable> newTaskQueue(int i);
}
