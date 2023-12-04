package io.grpc.netty.shaded.io.netty.handler.traffic;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.channel.ChannelPromise;
import io.grpc.netty.shaded.io.netty.util.concurrent.EventExecutor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
@ChannelHandler.Sharable
/* loaded from: classes4.dex */
public class GlobalTrafficShapingHandler extends AbstractTrafficShapingHandler {
    private final ConcurrentMap<Integer, PerChannel> channelQueues;
    long maxGlobalWriteSize;
    private final AtomicLong queuesSize;

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected int userDefinedWritabilityIndex() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PerChannel {
        long lastReadTimestamp;
        long lastWriteTimestamp;
        ArrayDeque<ToSend> messagesQueue;
        long queueSize;

        private PerChannel() {
        }
    }

    void createGlobalTrafficCounter(ScheduledExecutorService scheduledExecutorService) {
        TrafficCounter trafficCounter = new TrafficCounter(this, (ScheduledExecutorService) ObjectUtil.checkNotNull(scheduledExecutorService, "executor"), "GlobalTC", this.checkInterval);
        setTrafficCounter(trafficCounter);
        trafficCounter.start();
    }

    public GlobalTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j, long j2, long j3, long j4) {
        super(j, j2, j3, j4);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j, long j2, long j3) {
        super(j, j2, j3);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        super(j, j2);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalTrafficShapingHandler(ScheduledExecutorService scheduledExecutorService, long j) {
        super(j);
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(scheduledExecutorService);
    }

    public GlobalTrafficShapingHandler(EventExecutor eventExecutor) {
        this.channelQueues = PlatformDependent.newConcurrentHashMap();
        this.queuesSize = new AtomicLong();
        this.maxGlobalWriteSize = 419430400L;
        createGlobalTrafficCounter(eventExecutor);
    }

    public long getMaxGlobalWriteSize() {
        return this.maxGlobalWriteSize;
    }

    public void setMaxGlobalWriteSize(long j) {
        this.maxGlobalWriteSize = j;
    }

    public long queuesSize() {
        return this.queuesSize.get();
    }

    public final void release() {
        this.trafficCounter.stop();
    }

    private PerChannel getOrSetPerChannel(ChannelHandlerContext channelHandlerContext) {
        Integer valueOf = Integer.valueOf(channelHandlerContext.channel().hashCode());
        PerChannel perChannel = this.channelQueues.get(valueOf);
        if (perChannel == null) {
            PerChannel perChannel2 = new PerChannel();
            perChannel2.messagesQueue = new ArrayDeque<>();
            perChannel2.queueSize = 0L;
            perChannel2.lastReadTimestamp = TrafficCounter.milliSecondFromNano();
            perChannel2.lastWriteTimestamp = perChannel2.lastReadTimestamp;
            this.channelQueues.put(valueOf, perChannel2);
            return perChannel2;
        }
        return perChannel;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        getOrSetPerChannel(channelHandlerContext);
        super.handlerAdded(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.AbstractTrafficShapingHandler, io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        Channel channel = channelHandlerContext.channel();
        PerChannel remove = this.channelQueues.remove(Integer.valueOf(channel.hashCode()));
        if (remove != null) {
            synchronized (remove) {
                if (channel.isActive()) {
                    Iterator<ToSend> it = remove.messagesQueue.iterator();
                    while (it.hasNext()) {
                        ToSend next = it.next();
                        long calculateSize = calculateSize(next.toSend);
                        this.trafficCounter.bytesRealWriteFlowControl(calculateSize);
                        remove.queueSize -= calculateSize;
                        this.queuesSize.addAndGet(-calculateSize);
                        channelHandlerContext.write(next.toSend, next.promise);
                    }
                } else {
                    this.queuesSize.addAndGet(-remove.queueSize);
                    Iterator<ToSend> it2 = remove.messagesQueue.iterator();
                    while (it2.hasNext()) {
                        ToSend next2 = it2.next();
                        if (next2.toSend instanceof ByteBuf) {
                            ((ByteBuf) next2.toSend).release();
                        }
                    }
                }
                remove.messagesQueue.clear();
            }
        }
        releaseWriteSuspended(channelHandlerContext);
        releaseReadSuspended(channelHandlerContext);
        super.handlerRemoved(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.AbstractTrafficShapingHandler
    long checkWaitReadTime(ChannelHandlerContext channelHandlerContext, long j, long j2) {
        PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        return (perChannel == null || j <= this.maxTime || (j2 + j) - perChannel.lastReadTimestamp <= this.maxTime) ? j : this.maxTime;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.AbstractTrafficShapingHandler
    void informReadOperation(ChannelHandlerContext channelHandlerContext, long j) {
        PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        if (perChannel != null) {
            perChannel.lastReadTimestamp = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ToSend {
        final ChannelPromise promise;
        final long relativeTimeAction;
        final long size;
        final Object toSend;

        private ToSend(long j, Object obj, long j2, ChannelPromise channelPromise) {
            this.relativeTimeAction = j;
            this.toSend = obj;
            this.size = j2;
            this.promise = channelPromise;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.traffic.AbstractTrafficShapingHandler
    void submitWrite(final ChannelHandlerContext channelHandlerContext, Object obj, long j, long j2, long j3, ChannelPromise channelPromise) {
        PerChannel perChannel = this.channelQueues.get(Integer.valueOf(channelHandlerContext.channel().hashCode()));
        if (perChannel == null) {
            perChannel = getOrSetPerChannel(channelHandlerContext);
        }
        final PerChannel perChannel2 = perChannel;
        synchronized (perChannel2) {
            if (j2 == 0) {
                if (perChannel2.messagesQueue.isEmpty()) {
                    this.trafficCounter.bytesRealWriteFlowControl(j);
                    channelHandlerContext.write(obj, channelPromise);
                    perChannel2.lastWriteTimestamp = j3;
                    return;
                }
            }
            long j4 = (j2 <= this.maxTime || (j3 + j2) - perChannel2.lastWriteTimestamp <= this.maxTime) ? j2 : this.maxTime;
            ToSend toSend = new ToSend(j4 + j3, obj, j, channelPromise);
            perChannel2.messagesQueue.addLast(toSend);
            perChannel2.queueSize += j;
            this.queuesSize.addAndGet(j);
            checkWriteSuspend(channelHandlerContext, j4, perChannel2.queueSize);
            boolean z = this.queuesSize.get() > this.maxGlobalWriteSize;
            if (z) {
                setUserDefinedWritability(channelHandlerContext, false);
            }
            final long j5 = toSend.relativeTimeAction;
            channelHandlerContext.executor().schedule(new Runnable() { // from class: io.grpc.netty.shaded.io.netty.handler.traffic.GlobalTrafficShapingHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    GlobalTrafficShapingHandler.this.sendAllValid(channelHandlerContext, perChannel2, j5);
                }
            }, j4, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAllValid(ChannelHandlerContext channelHandlerContext, PerChannel perChannel, long j) {
        synchronized (perChannel) {
            ToSend pollFirst = perChannel.messagesQueue.pollFirst();
            while (true) {
                if (pollFirst != null) {
                    if (pollFirst.relativeTimeAction <= j) {
                        long j2 = pollFirst.size;
                        this.trafficCounter.bytesRealWriteFlowControl(j2);
                        perChannel.queueSize -= j2;
                        this.queuesSize.addAndGet(-j2);
                        channelHandlerContext.write(pollFirst.toSend, pollFirst.promise);
                        perChannel.lastWriteTimestamp = j;
                        pollFirst = perChannel.messagesQueue.pollFirst();
                    } else {
                        perChannel.messagesQueue.addFirst(pollFirst);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (perChannel.messagesQueue.isEmpty()) {
                releaseWriteSuspended(channelHandlerContext);
            }
        }
        channelHandlerContext.flush();
    }
}
