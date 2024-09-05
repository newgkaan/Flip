    fun calculateWinner(sender: UUID, receiver: UUID): UUID {
        val baseSize = (10..100).random() * 2

        val list = mutableListOf<UUID>()
        
        repeat(baseSize / 2) {
            list.add(sender)
            list.add(receiver)
        }
        
        list.shuffle()
        
        return list.random()
    }
