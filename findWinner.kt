fun calculateWinner(): UUID {
        val listSize = (10..100).random()
        val list = mutableListOf<UUID>()

        repeat(listSize / 2) {
            list.add(sender)
            list.add(receiver)
        }

        if (listSize % 2 != 0) {
            list.add(listOf(sender, receiver).random())
        }

        list.shuffle()

        return list.random()
    }
