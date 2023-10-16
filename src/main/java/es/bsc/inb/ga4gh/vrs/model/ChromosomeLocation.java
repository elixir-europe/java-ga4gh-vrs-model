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
 * A Location on a chromosome defined by a species and chromosome name.
 * 
 * @author Dmitry Repchevsky
 * 
 * @param <K> CURIE implementation class
 * @param <L> CytobandInterval implementation class
 */

public interface ChromosomeLocation<K extends CURIE, L extends CytobandInterval>
        extends Location, Serializable {
    
    final static String TYPE = "ChromosomeLocation";
    
    K getId();
    void setId(K id);
    
    K getSpeciesId();
    void setSpeciesId(K species_id);
    
    String getChromosome();    
    void setChromosome(String chromosome);
    
    L getInterval();    
    void setInterval(L interval);
}
