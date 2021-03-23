// Returns a random DNA base
const returnRandBase = () => {
    const dnaBases = ['A', 'T', 'C', 'G']
    return dnaBases[Math.floor(Math.random() * 4)] 
  }
  
  // Returns a random single stand of DNA containing 15 bases
  const mockUpStrand = () => {
    const newStrand = []
    for (let i = 0; i < 15; i++) {
      newStrand.push(returnRandBase())
    }
    return newStrand
  }
  
  function pAequorFactory(specimenNum, dna) {
    return {
      specimenNum,
      dna,
      mutate(){
        var index = Math.floor(Math.rand() * (this.dna.length));
        var NewBase = returnRandBase;
        while (this.dna[index] === NewBase) {
          NewBase = returnRandBase();
        }
        this.dna[index] = NewBase;
        return this.dna;
      },
      compareDNA(obj2) {
        var counter = 0;
        var length = this.specimenNum.length;
        for (i = 0; i < length; i++) {
          if (this.dna[i] === obj2.dna[i]) {
            counter += 1;
          }
        }
        const percentShared = (counter / this.dna.length) * 100;
        const percentageTo2Deci = percentShared.toFixed(2);
        console.log(`${this.specimanNum} and ${otherOrg.specimanNum} have ${percentageTo2Deci}% DNA in common.`);
      },
      willLikelySurvive() {
        const rate = this.dna.filter(ele => ele === "C" || ele === "G");
        return (rate.length / this.dna.length) >= 0.6;
      }
    }
  };
  
  const survivingSpecimen = [];
  let id = 1;
  
  while (survivingSpecimen.length < 30) {
    let newOrg = pAequorFactory(id, mockUpStrand());
    if (newOrg.willLikelySurvive()) {
      survivingSpecimen.push(newOrg);
    }
    id++;
  }
  
  console.log(survivingSpecimen)  