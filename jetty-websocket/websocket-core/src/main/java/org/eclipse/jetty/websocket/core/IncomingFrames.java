//
//  ========================================================================
//  Copyright (c) 1995-2018 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.core;

import org.eclipse.jetty.util.Callback;
import org.eclipse.jetty.websocket.core.frames.Frame;

/**
 * Interface for dealing with Incoming Frames.
 */
public interface IncomingFrames
{
    /**
     * Process the incoming frame.
     * <p>
     * Note: if you need to hang onto any information from the frame, be sure
     * to copy it, as the information contained in the Frame will be released
     * and/or reused by the implementation.
     *
     * @param frame the frame to process
     * @param callback the read completion
     */
    // TODO: rename back to not break existing Custom Extensions
    // TODO: alternate approach is to leave this for Extensions only to use, not using it websocket-core itself
    // TODO: a websocket-extensions-api module for a stable API would make sense then.
    void receiveFrame(Frame frame, Callback callback);
}
