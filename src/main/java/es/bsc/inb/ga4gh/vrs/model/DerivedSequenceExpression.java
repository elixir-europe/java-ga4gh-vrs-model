/**
 * *****************************************************************************
 * Copyright (C) 2023 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
 * and Barcelona Supercomputing Center (BSC)
 *
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 *****************************************************************************
 */

package es.bsc.inb.ga4gh.vrs.model;

import java.io.Serializable;

/**
 * An approximate expression of a sequence that is derived from a referenced 
 * sequence location.Use of this class indicates that the derived sequence 
 * is [approximately equivalent] to the reference indicated, and is typically 
 * used for describing large regions in contexts where the use of an approximate 
 * sequence is inconsequential.
 * 
 * @author Dmitry Repchevsky
 * 
 * @param <K> SequenceLocation implementation class
 */

public interface DerivedSequenceExpression<K extends SequenceLocation>
        extends SingleSequenceExpression, Serializable {
    
    final static String TYPE = "DerivedSequenceExpression";
    
    K getLocation();
    void setLocation(K location);
    
    Boolean getReverseComplement();
    void setReverseComplement(Boolean reverse_complement);
}
