package edu.tcu.cs.hogwartsartifactsonline.service;


import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import edu.tcu.cs.hogwartsartifactsonline.utils.IdWorker;

@Service
@Transactional
public class ArtifactService {

    private ArtifactDao artifactDao;
    private IdWorker idWorker;

    public ArtifactService(ArtifactDao artifactDao, IdWorker idWorker) {
        this.artifactDao = artifactDao;
        this.idWorker = idWorker;
    }

    public List<Artifact> findAll(){
        return artifactDao.findAll();
    }


    public Artifact findById(String artifactId){
        return artifactDao.findById(artifactId).get();
    }


    public void save(Artifact newArtifact){
        newArtifact.setId(idWorker.nextId() + "");
        artifactDao.save(newArtifact);
    }

    public void update(String artifactId, Artifact updatedArtifact){
        updatedArtifact.setId(artifactId);
        artifactDao.save(updatedArtifact);
    }

    public void delete(String artifactId){
        artifactDao.deleteById(artifactId);
    }
}
