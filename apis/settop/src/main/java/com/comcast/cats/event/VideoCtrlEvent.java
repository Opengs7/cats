/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * This file is part of CATS.
 *
 * CATS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CATS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CATS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comcast.cats.event;

/**
 * Class for the VideoCtrlEvent
 * 
 */
public class VideoCtrlEvent extends CatsEvent
{
    /**
     * Serial version id
     */
    private static final long serialVersionUID = -8820459291010302918L;

    /**
     * No-argument Constructor
     */
    public VideoCtrlEvent()
    {
    }

    /**
     * Constructor
     * 
     * @param sequence
     * @param sourceId
     * @param source
     */
    public VideoCtrlEvent( Integer sequence, String sourceId, Object source )
    {
        super( sequence, sourceId, source, CatsEventType.VIDEO_CTRL );
    }
}
