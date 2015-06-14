/******************************************************************************
 *                                                                             *
 *  Copyright: (c) Syncleus, Inc.                                              *
 *                                                                             *
 *  You may redistribute and modify this source code under the terms and       *
 *  conditions of the Open Source Community License - Type C version 1.0       *
 *  or any later version as published by Syncleus, Inc. at www.syncleus.com.   *
 *  There should be a copy of the license included with this file. If a copy   *
 *  of the license is not included you are granted no right to distribute or   *
 *  otherwise use this file except through a legal and valid license. You      *
 *  should also contact Syncleus, Inc. at the information below if you cannot  *
 *  find a license:                                                            *
 *                                                                             *
 *  Syncleus, Inc.                                                             *
 *  2604 South 12th Street                                                     *
 *  Philadelphia, PA 19148                                                     *
 *                                                                             *
 ******************************************************************************/
package com.syncleus.ferma.annotations;

import com.syncleus.ferma.ClassInitializer;
import com.syncleus.ferma.DefaultClassInitializer;
import com.syncleus.ferma.Knows;
import com.syncleus.ferma.Person;
import com.tinkerpop.blueprints.Direction;

public abstract class Friend extends Person {
    static final ClassInitializer<Friend> DEFAULT_INITIALIZER = new DefaultClassInitializer(Friend.class);
    
    
    @Incidence(label="knows", direction=Direction.OUT)
    public abstract Knows addKnows(Friend programmer);

    @Incidence(label="knows", direction=Direction.IN)
    public abstract Knows addKnownBy(Friend programmer);
}