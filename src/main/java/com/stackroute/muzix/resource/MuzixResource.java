package com.stackroute.muzix.resource;


import com.stackroute.muzix.model.Muzix;
import com.stackroute.muzix.repository.MuzixRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muzix/")
public class MuzixResource
{
    private MuzixRepository muzixRepository;

    public MuzixResource(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }

    //List of tracks
    @GetMapping("/all")
    public List<Muzix> getAll()
    {
        return muzixRepository.findAll();
    }

    // Delete a track using trackid
    @DeleteMapping("/deleted/{id}")
    public void delete(@PathVariable("id") int id)
    {
        this.muzixRepository.deleteById(id);

    }


    // Insert a track, entire track details must be given
    @PutMapping("inserted")
    public void insert(@RequestBody Muzix track)
    {
        this.muzixRepository.insert(track);

    }


    // Update a track, entire track details must be given with existing id
    @PostMapping("updated")
    public void update(@RequestBody Muzix track)
    {
        this.muzixRepository.save(track);
    }

}
